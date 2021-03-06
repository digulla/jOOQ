/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "JobCandidate", schema = "HumanResources")
public class JobCandidate implements java.io.Serializable {

	private static final long serialVersionUID = -528582852;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  JobCandidateID;
	private java.lang.Integer  EmployeeID;
	private java.lang.Object   Resume;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "JobCandidateID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getJobCandidateID() {
		return this.JobCandidateID;
	}

	public void setJobCandidateID(java.lang.Integer JobCandidateID) {
		this.JobCandidateID = JobCandidateID;
	}

	@javax.persistence.Column(name = "EmployeeID", precision = 10)
	public java.lang.Integer getEmployeeID() {
		return this.EmployeeID;
	}

	public void setEmployeeID(java.lang.Integer EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	@javax.persistence.Column(name = "Resume")
	public java.lang.Object getResume() {
		return this.Resume;
	}

	public void setResume(java.lang.Object Resume) {
		this.Resume = Resume;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
