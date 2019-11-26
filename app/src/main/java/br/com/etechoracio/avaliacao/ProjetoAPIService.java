package br.com.etechoracio.avaliacao;

import retrofit2.Call;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ProjetoAPIService {

    @PUT("funcoes/subtracao")
    Call<String> putSubtracao(@Query("num1") String num1, @Query("num2") String num2);
}
