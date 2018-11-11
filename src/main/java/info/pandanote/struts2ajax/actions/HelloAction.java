package info.pandanote.struts2ajax.actions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import net.arnx.jsonic.JSON;

/**
 * <code>Set welcome message.</code>
 */
@Results({
    @Result(name = "download", type = "stream",
    		params = { "contentType", "application/json; charset=utf-8", "inputName", "inputStream" })
})
public class HelloAction extends ActionSupport {
	InputStream inputStream;

	public String data1;

	public String data2;

    public String execute() throws Exception {
        setMessage(getText(MESSAGE));
        return "success";
    }

    @Action("ajax")
    public String ajax() throws Exception {
    	Map<String,String> map = new LinkedHashMap<String,String>();
    	map.put("1","https://pandanote.info/");
    	map.put("2","https://sidestory.pandanote.info/");
    	map.put("data1", data1);
    	map.put("data2", data2);
    	inputStream = new ByteArrayInputStream(JSON.encode(map).getBytes());
    	return "download";
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}
}
