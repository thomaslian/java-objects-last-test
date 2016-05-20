public class User {
  private Forum mForum;
  private String mFirstName;
  private String mLastName;
  
  public User(Forum forum){
   mForum = forum; 
  }
  
  public User(String firstName, String lastName) {
    // TODO:  Set the private fields here
    mFirstName = firstName;
    mLastName = lastName;
  }
  public void setFirstName(String firstName) {
       mFirstName = firstName;
  }
  public void setLastName(String lastName) {
       mLastName = lastName;
  }
  public String getFirstName() {
       return mFirstName;
  }
  public String getLastName() {
       return mLastName;
  }
}
