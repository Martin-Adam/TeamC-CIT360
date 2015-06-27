package socketPoke;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SocketPokeClient {

    private BufferedReader in;
    private PrintWriter out;
    private JFrame frame = new JFrame("Pokemon Chooser");
    private JTextField dataField = new JTextField(40);
    private JTextArea messageArea = new JTextArea(8, 60);

    public SocketPokeClient() {

        // Layout GUI
        messageArea.setEditable(false);
        frame.getContentPane().add(dataField, "North");
        frame.getContentPane().add(new JScrollPane(messageArea), "Center");

        // Add Listeners
        dataField.addActionListener(new ActionListener() {
            /**
             * Responds to pressing the enter key in the textfield
             * by sending the contents of the text field to the
             * server and displaying the response from the server
             * in the text area.  If the response is "." we exit
             * the whole application, which closes all sockets,
             * streams and windows.
             */
            public void actionPerformed(ActionEvent e) {
                out.println(dataField.getText());
                
                String response;
                PokeInfo getInfo = new PokeInfo();
                
                try {
                	response = getInfo.getPokeInfo(Integer.parseInt(in.readLine()));
                    if (response == null || response.equals("")) {
                        System.exit(0);
                    }
                } catch (IOException ex) {
                    response = "Error: " + ex;
                }


                messageArea.append(response + "\n");
                dataField.selectAll();
            }
        });
    }

    public void connectToServer() throws IOException {

        @SuppressWarnings("resource")
		Socket socket = new Socket("localhost", 9898);
        in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        for (int i = 0; i < 3; i++) {
            messageArea.append(in.readLine() + "\n");
        }
    }


    public static void main(String[] args) throws Exception {
    	SocketPokeClient client = new SocketPokeClient();
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.frame.pack();
        client.frame.setVisible(true);
        client.connectToServer();
    }
}
