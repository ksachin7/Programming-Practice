package CDAC_Practice;

public class FinalizeOverride {
//  The finalize method, which is present in the Object class, has an empty implementation. Here I'm Overriding it..
    protected void finalize() throws Throwable
    {
        try {

            System.out.println("inside finalize()");
        }
        catch (Throwable e) {

            throw e;
        }
        finally {

            System.out.println("Calling finalize method"
                    + " of the Object class");

            // Calling finalize() of Object class
            super.finalize();
        }
    }

    // Driver code
    public static void main(String[] args) throws Throwable
    {
        FinalizeOverride fo = new FinalizeOverride();
        // Calling finalize of FinalizeOverride
        fo.finalize();
    }

}