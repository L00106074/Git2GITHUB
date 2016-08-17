/**
 * @author Emma Mc Namee
 * @Date 20/07/2016
 * @Desc grades git practical
 */
package pojo.lyitlabs.ie;

public class grages {
		private int studentid = 123456789;
		private String moduleid = "ENTPERF";
		private double grade = 0.0;
      private int classid = 5867484;
		
		public double getGrade() {
			return grade;
		}
		public void setGrade(double grade) {
			this.grade = grade;
		}
		public int getStudentid() {
			return studentid;//this code has just been added
		}
		public String getModuleid() {
			return moduleid;// this comment has been added 17 August
		}
      public String getClassid() {
			return classid;// this comment has been added 17 August
		}
}