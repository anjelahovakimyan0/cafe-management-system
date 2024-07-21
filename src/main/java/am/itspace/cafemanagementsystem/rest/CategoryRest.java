package am.itspace.cafemanagementsystem.rest;

import am.itspace.cafemanagementsystem.POJO.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/category")
public interface CategoryRest {

    @PostMapping(path = "/add")
    ResponseEntity<String> addNewCategory(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/get")
    ResponseEntity<List<Category>> getAllCategory(@RequestParam(required = false) String filterValue);

    @PostMapping("/update")
    ResponseEntity<String> updateCategory(@RequestBody(required = true) Map<String, String> requestMap);

}
