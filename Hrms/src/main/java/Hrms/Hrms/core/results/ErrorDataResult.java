package Hrms.Hrms.core.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(boolean success, T data,String message) {
		super(false,data,message);
		
	}

	public ErrorDataResult( T data,String message) {
		super(false,data,message);
		
	

}
	public ErrorDataResult( T data) {
		super(false,data);
		
	}
	public ErrorDataResult( String message) {
		super(false,null,message);
		
}
	public ErrorDataResult() {
		super(false);
		
	}

}
