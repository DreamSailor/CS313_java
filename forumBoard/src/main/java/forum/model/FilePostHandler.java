/**
 *
 * @author jsimpson
 */

package forum.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FilePostHandler 
{
        
   
    private String fileName;

    public FilePostHandler(String fileName) {
           this.fileName = fileName;
    }

    public String getFileName() {
           return fileName;
    }

    public void setFileName(String fileName) {
           this.fileName = fileName;
    }
    
    public void addPost(ForumPost post) 
    {
        try {
               BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));
               writer.write(post.toFileString() + "\n");
               writer.close(); 

          } catch (IOException e) { 
               e.printStackTrace();
          }
     }
    
  //  @Override
     public List<ForumPost> getPosts() {
          List<ForumPost> list = new ArrayList<ForumPost>();

          try {
               BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

               String line;

               while ((line = reader.readLine()) != null) {
                    ForumPost post = new ForumPost();
                    post.loadFromFileString(line);
                    list.add(post);
               }

          } catch (IOException e) { 
               e.printStackTrace();
          }

          return list;
     }
    
  
    
}
