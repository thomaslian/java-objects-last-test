public class ForumPost {
  private User mAuthor;
  private String mTitle;
  private String mDescription;

  public ForumPost(User author, String title, String description){
    mAuthor = author;
    mTitle = title;
    mDescription = description;
  }
  
  public User getAuthor() {
    return mAuthor;
  }

  public String getTitle() {
    return mTitle;
  }
  public String getDescription() {
    return mDescription;
  }
}
