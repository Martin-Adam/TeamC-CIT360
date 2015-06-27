package PokeHttp;


public class PokeHttpRun {
	public static void main(String[] args) {

        PokeInfo getInfo = new PokeInfo();

        //Tries to find Blubasaur
        System.out.println("Good way");
        getInfo.getPokeInfo(3);

        System.out.println("Bad way");
        getInfo.getPokeInfo(9001);
    }
}
