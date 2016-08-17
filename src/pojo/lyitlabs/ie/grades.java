/**
 * @author Emma Mc Namee
 * @Date 20/07/2016
 * @Desc grades git practical
 */
package pojo.lyitlabs.ie;

public class grades {
		private int studentid = 123456789;
		private String moduleid = "ENTPERF";
		private double grade = 0.0;
		
		public double getGrade() {
			return grade;
		}
		public void setGrade(double grade) {
			this.grade = grade;
		}
		public int getStudentid() {
			return studentid;//this code has just been added
			//this is also new code
		}
		public String getModuleid() {
			return moduleid;
		}
}