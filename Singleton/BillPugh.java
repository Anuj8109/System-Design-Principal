package Singleton;

public class BillPugh {
        private BillPugh(){};

        private static class SingletonHelper {
            private static final BillPugh INSTANCE = new BillPugh();         
        }
        
        public BillPugh getInstance(){
            return SingletonHelper.INSTANCE;
        }
}
