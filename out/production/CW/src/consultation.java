import java.io.Serializable;
import java.util.Date;
 public class consultation implements Serializable {
     private Date date;
     private String time;
     private int cost;
     private String notes;

     public consultation(Date date, String time) {
         this.date = date;
         this.time= this.time;
         this.cost = cost;
         this.notes = notes;
     }

     public Date getdate() {
         return date;
     }

     public void setdate(Date date) {
         this.date = date;

     }
     public String gettime(){return time;}

     public void settime(){this.time=time;}

     public int getcost(){
         return cost;
     }
     public void setcost(){this.cost=cost;}

     public String getNotes(){return notes;}
     public void setNotes(){this.notes=notes;}










    }




