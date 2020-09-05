package app;

import app.a.HelloController;
import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc(new HelloController());
  }

  public static void main(final String[] args) {


    runApp(args, App::new);

  
  }


}
