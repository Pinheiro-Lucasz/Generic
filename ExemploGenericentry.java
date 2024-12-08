package Mod17;

public class ExemploGenericentry {

    public static  void main(String args []){
        GenericEntry<String, String> entry = new GenericEntry<String, String>("Civic", "Ranger");
        System.out.println(entry.getCivic() + " " + entry.getRanger());

    }
}
