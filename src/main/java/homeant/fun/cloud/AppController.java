package homeant.fun.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class AppController {

    @Value("${name:1}")
    private String name;

    @Value(value = "${ceshi.test:1}")
    private String test;

    @GetMapping({"","/"})
    public Map<String,Object> index(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name",name);
        map.put("test",test);
        return map;
    }
}
