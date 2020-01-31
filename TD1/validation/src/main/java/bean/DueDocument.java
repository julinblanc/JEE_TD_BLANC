package bean;

import java.util.Date;

public class DueDocument extends Document {

    private Date dueDate;


    public DueDocument(String title, String content, Date cDate, Date lModif, Date dDate) {
         super(title, content, cDate, lModif);
         this.dueDate = dDate;
    }
}
