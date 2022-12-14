package pl.sztukakodu.springboot3security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postings")
class PostingsController {

    @GetMapping
    public List<Posting> postings() {
        return List.of(
            new Posting("Wrangler Jeans", 100.0),
            new Posting("Washing Machine", 999.0)
        );
    }

    @GetMapping("/vip")
    public List<Posting> vipPostings() {
        return List.of(new Posting("Samsung TV 55", 1099.0));
    }

}
