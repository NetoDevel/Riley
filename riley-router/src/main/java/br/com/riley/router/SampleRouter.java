package br.com.riley.router;

import io.reactivex.Observable;

import static br.com.riley.router.RouteRegistry.get;

public class SampleRouter {{

    get("/index", (ctx) -> {
        return Observable.just("");
    });
}

}
