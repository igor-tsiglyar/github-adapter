package io.tsiglyar.github.adapter;

import io.tsiglyar.github.Repository;
import org.reactivestreams.Publisher;

public interface GithubAdapter {

  Publisher<Repository> getRepositoriesToContribute(String language);

}
