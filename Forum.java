public class Forum {
  private String mTopic;
  private String mFirstName;
  private String mLastName;
  
  public Forum(String topic){
    mTopic = topic;
  }
  
  public String getTopic() {
      return mTopic;
  }
    
  public void addPost(ForumPost post) {
      System.out.printf("New post from %s %s about %s.\n",
                         post.getAuthor().getFirstName(),
                         post.getAuthor().getLastName(),
                         post.getTitle());
  }
}
