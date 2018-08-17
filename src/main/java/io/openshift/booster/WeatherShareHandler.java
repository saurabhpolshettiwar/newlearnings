package io.openshift.booster;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.BodyInserters;

@Component
public class WeatherShareHandler {

	public Mono<ServerResponse> weather(ServerRequest request) {
		return ServerResponse.ok().body(request.bodyToMono(String.class), String.class);
	}

	public Mono<ServerResponse> sharePrice(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("World"));
	}
}