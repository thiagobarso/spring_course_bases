package br.mil.eb.cds.springcloudhystrix.springcloudhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class HystrixService {

    @HystrixCommand(fallbackMethod = "getMensagemFallback")
    public String getMensagem(){
        if(new File("/tmp/break.txt").exists()){
            throw new RuntimeException("Arquivo /tmp/break.txt não encontrado!");
        }

        return "tudo OK";
    }

    public String getMensagemFallback(){
        return "Mensagem do Fallback!!";
    }
}
