/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.model;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author jsimpson
 */
public class ForumPost 
{
  private String user;
  private String pTime;
  private String post;
  private final Date myDate = new Date();
  DateFormat df = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss a");

  //Default Constructor
  public ForumPost()
  {
    setUser("");
    setPost("");
    setDate();
  }

  //Other Constructor
  public ForumPost(String user, String post) {
    this.setUser(user);
    this.setPost(post);
    this.setDate();
  }

  //Setter and getters
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getTime() {
    return pTime;
  }

  public void setTime(String pTime) {
    this.pTime = pTime;
  }
  
  public void setDate()
  {
      this.pTime = df.format(myDate);
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }
  
  public String toFileString() {
            return user + "~" + pTime + "~" + post;
     }

 
  public void loadFromFileString(String str) {
        String[] parts = str.split("~");


        user = parts[0];
        pTime = parts[1];
        post = parts[2];
     }
  
 @Override
    public String toString() {
      return user + " " + pTime + " " + post;
    }
}
