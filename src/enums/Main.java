package enums;

public class Main {

    //τα enums ουσιαστικα τα χειριζομαστε εδω σαν instances ανωνυμων subclasses
    // της κλασης του enum.
    public static void main(String[] args) {


        Role role = Role.STUDENT;

        AccountType accountType = AccountType.CURRENT;

        //αν θελω να μετατρεψω το enum σε string (πχ για να αποθηκευσω σε μια ΒΔ)
        String strAccountType = accountType.name();

        System.out.println(strAccountType);

        //αν παρω ενα String (πχ απο την ΒΔ) και θελω να το κανω enum
        AccountType accountType1 = AccountType.valueOf(strAccountType);

        for(AccountType value : AccountType.values()){
            System.out.print(value.name() + " "); //string
            System.out.println(value.ordinal()); //ordinal number
        }
    }
}
