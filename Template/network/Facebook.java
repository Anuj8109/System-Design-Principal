package SystemDesign.Template.network;

public class Facebook extends Network{

    public Facebook(String username,String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.username);
        System.out.print("Password: ");
        for(int i=0; i< password.length();i++){
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    public boolean sendData(byte[] bytes) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(bytes) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logout() {
        System.out.println("User: '" + username + "' was logged out from Facebook");
    }

    private void simulateNetworkLatency(){
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
