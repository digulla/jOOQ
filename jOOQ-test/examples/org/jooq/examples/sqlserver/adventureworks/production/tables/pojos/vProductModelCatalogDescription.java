/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductModelCatalogDescription", schema = "Production")
public class vProductModelCatalogDescription implements java.io.Serializable {

	private static final long serialVersionUID = -1326099174;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ProductModelID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   Name;
	private java.lang.String   Summary;
	private java.lang.String   Manufacturer;

	@javax.validation.constraints.Size(max = 30)
	private java.lang.String   Copyright;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   ProductURL;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   WarrantyPeriod;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   WarrantyDescription;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   NoOfYears;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   MaintenanceDescription;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Wheel;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Saddle;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Pedal;
	private java.lang.String   BikeFrame;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Crankset;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   PictureAngle;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   PictureSize;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   ProductPhotoID;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Material;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Color;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   ProductLine;

	@javax.validation.constraints.Size(max = 256)
	private java.lang.String   Style;

	@javax.validation.constraints.Size(max = 1024)
	private java.lang.String   RiderExperience;

	@javax.validation.constraints.NotNull
	private java.lang.String   rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "ProductModelID", nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return this.ProductModelID;
	}

	public void setProductModelID(java.lang.Integer ProductModelID) {
		this.ProductModelID = ProductModelID;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "Summary")
	public java.lang.String getSummary() {
		return this.Summary;
	}

	public void setSummary(java.lang.String Summary) {
		this.Summary = Summary;
	}

	@javax.persistence.Column(name = "Manufacturer")
	public java.lang.String getManufacturer() {
		return this.Manufacturer;
	}

	public void setManufacturer(java.lang.String Manufacturer) {
		this.Manufacturer = Manufacturer;
	}

	@javax.persistence.Column(name = "Copyright", length = 30)
	public java.lang.String getCopyright() {
		return this.Copyright;
	}

	public void setCopyright(java.lang.String Copyright) {
		this.Copyright = Copyright;
	}

	@javax.persistence.Column(name = "ProductURL", length = 256)
	public java.lang.String getProductURL() {
		return this.ProductURL;
	}

	public void setProductURL(java.lang.String ProductURL) {
		this.ProductURL = ProductURL;
	}

	@javax.persistence.Column(name = "WarrantyPeriod", length = 256)
	public java.lang.String getWarrantyPeriod() {
		return this.WarrantyPeriod;
	}

	public void setWarrantyPeriod(java.lang.String WarrantyPeriod) {
		this.WarrantyPeriod = WarrantyPeriod;
	}

	@javax.persistence.Column(name = "WarrantyDescription", length = 256)
	public java.lang.String getWarrantyDescription() {
		return this.WarrantyDescription;
	}

	public void setWarrantyDescription(java.lang.String WarrantyDescription) {
		this.WarrantyDescription = WarrantyDescription;
	}

	@javax.persistence.Column(name = "NoOfYears", length = 256)
	public java.lang.String getNoOfYears() {
		return this.NoOfYears;
	}

	public void setNoOfYears(java.lang.String NoOfYears) {
		this.NoOfYears = NoOfYears;
	}

	@javax.persistence.Column(name = "MaintenanceDescription", length = 256)
	public java.lang.String getMaintenanceDescription() {
		return this.MaintenanceDescription;
	}

	public void setMaintenanceDescription(java.lang.String MaintenanceDescription) {
		this.MaintenanceDescription = MaintenanceDescription;
	}

	@javax.persistence.Column(name = "Wheel", length = 256)
	public java.lang.String getWheel() {
		return this.Wheel;
	}

	public void setWheel(java.lang.String Wheel) {
		this.Wheel = Wheel;
	}

	@javax.persistence.Column(name = "Saddle", length = 256)
	public java.lang.String getSaddle() {
		return this.Saddle;
	}

	public void setSaddle(java.lang.String Saddle) {
		this.Saddle = Saddle;
	}

	@javax.persistence.Column(name = "Pedal", length = 256)
	public java.lang.String getPedal() {
		return this.Pedal;
	}

	public void setPedal(java.lang.String Pedal) {
		this.Pedal = Pedal;
	}

	@javax.persistence.Column(name = "BikeFrame")
	public java.lang.String getBikeFrame() {
		return this.BikeFrame;
	}

	public void setBikeFrame(java.lang.String BikeFrame) {
		this.BikeFrame = BikeFrame;
	}

	@javax.persistence.Column(name = "Crankset", length = 256)
	public java.lang.String getCrankset() {
		return this.Crankset;
	}

	public void setCrankset(java.lang.String Crankset) {
		this.Crankset = Crankset;
	}

	@javax.persistence.Column(name = "PictureAngle", length = 256)
	public java.lang.String getPictureAngle() {
		return this.PictureAngle;
	}

	public void setPictureAngle(java.lang.String PictureAngle) {
		this.PictureAngle = PictureAngle;
	}

	@javax.persistence.Column(name = "PictureSize", length = 256)
	public java.lang.String getPictureSize() {
		return this.PictureSize;
	}

	public void setPictureSize(java.lang.String PictureSize) {
		this.PictureSize = PictureSize;
	}

	@javax.persistence.Column(name = "ProductPhotoID", length = 256)
	public java.lang.String getProductPhotoID() {
		return this.ProductPhotoID;
	}

	public void setProductPhotoID(java.lang.String ProductPhotoID) {
		this.ProductPhotoID = ProductPhotoID;
	}

	@javax.persistence.Column(name = "Material", length = 256)
	public java.lang.String getMaterial() {
		return this.Material;
	}

	public void setMaterial(java.lang.String Material) {
		this.Material = Material;
	}

	@javax.persistence.Column(name = "Color", length = 256)
	public java.lang.String getColor() {
		return this.Color;
	}

	public void setColor(java.lang.String Color) {
		this.Color = Color;
	}

	@javax.persistence.Column(name = "ProductLine", length = 256)
	public java.lang.String getProductLine() {
		return this.ProductLine;
	}

	public void setProductLine(java.lang.String ProductLine) {
		this.ProductLine = ProductLine;
	}

	@javax.persistence.Column(name = "Style", length = 256)
	public java.lang.String getStyle() {
		return this.Style;
	}

	public void setStyle(java.lang.String Style) {
		this.Style = Style;
	}

	@javax.persistence.Column(name = "RiderExperience", length = 1024)
	public java.lang.String getRiderExperience() {
		return this.RiderExperience;
	}

	public void setRiderExperience(java.lang.String RiderExperience) {
		this.RiderExperience = RiderExperience;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}