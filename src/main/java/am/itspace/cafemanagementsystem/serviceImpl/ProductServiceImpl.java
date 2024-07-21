package am.itspace.cafemanagementsystem.serviceImpl;

import am.itspace.cafemanagementsystem.JWT.JwtFilter;
import am.itspace.cafemanagementsystem.constants.CafeConstants;
import am.itspace.cafemanagementsystem.dao.ProductDao;
import am.itspace.cafemanagementsystem.service.ProductService;
import am.itspace.cafemanagementsystem.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private JwtFilter jwtFilter;

    @Autowired
    private ProductDao productDao;

    @Override
    public ResponseEntity<String> addNewProduct(Map<String, String> requestMap) {
        try {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
