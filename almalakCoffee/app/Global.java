import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.libs.F;
import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;


public class Global extends GlobalSettings {
	
	
	  @Override
	  public void onStart(Application app) {
	    Logger.info("Application has started");
	  }  
	  
	  @Override
	  public void onStop(Application app) {
	    Logger.info("Application shutdown...");
	  }  

	  @Override
	  public Promise<Result> onError(Http.RequestHeader request,java.lang.Throwable t){
		  return Promise.<Result>pure(
		            Results.internalServerError("A server error occurred: " + t.getMessage())
		        );
		  
	  }
	  
	  @Override
	  public Action onRequest(Http.Request request,java.lang.reflect.Method actionMethod){
				return null;
		  
	  }
	  
	  @Override
	  public play.api.mvc.Handler onRouteRequest(Http.RequestHeader request){
		return null;
		  
	  }
	  
	  public Promise<Result> onHandlerNotFound(Http.RequestHeader request){
		return null;
		  
	  }
	  
	  
	  public Promise<Result> onBadRequest(Http.RequestHeader request,
              java.lang.String error){
				return null;
		  
	  }
	  
	  


}
