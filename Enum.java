public class Enum {
    public static void main (String[] args) {
        Status s = Status.Success;
        System.out.println(s);

        
        Status ss[] = Status.values();
        for(Status i: ss) {
            System.out.println(i + "\t=> " + i.ordinal());
        }

        Status st = Status.Pending;

        // if - else if- else
        if (st == Status.Running) 
            System.out.println("All good!");
        else if (st == Status.Failed) 
            System.out.println("Try again!");
        else if (st == Status.Pending)
            System.out.println("Please wait!");
        else
            System.out.println("Done!");
        
        // switch case
        switch (st) {
            case Running:
                System.out.println("All good!");
                break;
            case Pending:
                System.out.println("Please wait!");
                break;  
            case Failed:
                System.out.println("Try again!");
                break;
            case Success:
                System.out.println("Done!");
                break;  
            default:
                System.out.println("Invalid status");
                break;
        }
    }
}

enum Status {
    Running, Failed, Pending, Success;
}