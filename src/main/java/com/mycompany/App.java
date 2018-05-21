package com.mycompany;

import org.jooby.Jooby;
import org.jooby.apitool.ApiTool;

/**
 * @author jooby generator
 */
public class App extends Jooby {
    public App() {
        use(MyRoute.class);
        use(new ApiTool().swagger("/swagger"));
    }

    public static void main(final String[] args) {
        run(App::new, args);
    }

}
