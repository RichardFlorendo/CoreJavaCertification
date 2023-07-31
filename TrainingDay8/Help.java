public class Help {
    void helpon(int item){
        switch(item){
            case '1':
                System.out.println("If Help: \n if(condition){ \n Statements...; \n } \n else{ \n Statements...; \n }");
                break;

            case '2':
                System.out.println("Switch Help: \n switch(case){ \n Statements...; \n break; \n //... \n }");
                break;

            case '3':
                System.out.println("For Help: \n for(initialize; end condition; iteration){ \n Statements...; \n }");
                break;

            case '4':
                System.out.println("While Help: \n while(condition){ \n Statements...; \n }");
                break;

            case '5':
                System.out.println("Do-While Help: \n do{ \n Statements...; \n } while(condition);");
                break;

            case '6':
                System.out.println("Break Help: \n break; or break label;");
                break;

            case '7':
                System.out.println("Continue Help: \n continue; or continue label;");
                break;

            default:
                System.out.println("Invalid selection");
        }
    }

    void showmenu(){
        System.out.println("This program will help you remember the formats of some functions");
        System.out.println("Which would you want help with?");
        System.out.println("1: If");
        System.out.println("2: Switch");
        System.out.println("3: For");
        System.out.println("4: While");
        System.out.println("5: Do-While");
        System.out.println("6: Break");
        System.out.println("7: Continue");
        System.out.print("Input your choice or 'q' to quit: ");
    }

    boolean isvalid(int ch){
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
