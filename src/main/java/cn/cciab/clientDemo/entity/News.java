package cn.cciab.clientDemo.entity;
import java.io.Serializable;
/**
 * 
 * @author jarvis
 * demo的测试实体类,拿新闻举例
 *
 */
public class News implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 新闻主键
	 * */
	private int newsId;
	/**
	 * 新闻标题
	 * */
	private String newsTitle;
	private String newsAuthor;
	private String newsContent;
	private String insertTime;
	/**新闻类别*/
	private String typeName;
	
	/**
	 * 全属性的构造函数
	 * */
	public News(int id,String title,String author,String content,String insertTime){
		this.newsId=id;
		this.newsTitle=title;
		this.newsAuthor=author;
		this.newsContent=content;
		this.insertTime=insertTime;
	}
	public News(){
		
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsAuthor() {
		return newsAuthor;
	}
	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
