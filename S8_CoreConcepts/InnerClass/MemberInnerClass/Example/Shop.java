package S8_CoreConcepts.InnerClass.MemberInnerClass.Example;

public class Shop {
    Lock lock= new Lock();

    //method
    public void shopStatus(){
        if ( lock.isLocking()){
            System.out.println("Shop closed");
        } 
        else{
            System.out.println("Shop Open");
        }
    }
    //getter
    public Lock getLock() {
        return lock;
    }


    // inner class
    //by default it is public but we can also set it private
    public class Lock{
        private boolean locking= true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }
        
    }
}
