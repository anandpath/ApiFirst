package in.anandpath.sample.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SampleController implements SampleApi {
    @Override
    public ResponseEntity<String> greet(String name, String channel) {
        log.info("Got input - name: {}, channel: {}", name, channel);
        return new ResponseEntity<>("Hello " + name + " from " + channel + " channel", HttpStatus.OK);
    }
}
