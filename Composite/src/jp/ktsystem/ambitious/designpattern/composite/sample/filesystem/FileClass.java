package jp.ktsystem.ambitious.designpattern.composite.sample.filesystem;

import java.util.Date;

/**
 * <h1>Leaf class of composite pattern.</h1>
 *
 * @author KTSystem_RyoichiObara
 * @since 2013/1/18
 */
public class FileClass {

	private String filename;
	private String attribute;
	private final Date created;
	private Date modified;

	private String content;

	public FileClass(String filename, String attribute, String content) {
		this.filename  = filename;
		this.attribute = attribute;
		this.content = content;

		this.created = new Date();
		this.modified = created;
	}

	// ----- Public

	public void changeName(String newFilename) {
		this.filename = newFilename;
		modified = new Date();
	}

	public void changeAttribute(String newAttribute) {
		this.attribute = newAttribute;
		modified = new Date();
	}

	public void changeContent(String newContent) {
		this.content = newContent;
		modified = new Date();
	}

	//

	public int getSize() {
		return content.length();
	}

	// ----- Getter and setter.

	public String getFilename() {
		return filename;
	}
	public String getAttribute() {
		return attribute;
	}
	public Date getModified() {
		return modified;
	}
	public Date getCreated() {
		return created;
	}

}
