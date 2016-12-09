package br.com.fatecpg.brasileirao;

public interface AsyncResult {
    void onResult(String response);
    void onException(Exception e);
}
