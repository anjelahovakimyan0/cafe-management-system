package am.itspace.cafemanagementsystem.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.util.AbstractList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class CafeUtils {

   public static ObjectMapper objectMapper =new ObjectMapper();
    private CafeUtils() {
    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus) {
        return new ResponseEntity<String>("{\"message\": \"" + responseMessage + "\"}", httpStatus);
    }

    public static String getUUID() {
        Date date = new Date();
        long time = date.getTime();
        return "Bill-" + time;
    }

    public static JSONArray getJsonArrayFromString(AbstractList data) {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(data);
        return jsonArray;
    }

    // JSON to java object
    public static Map<Object, Object> getMapFromJson(String data) {
        if (!Strings.isNullOrEmpty(data)) {
            return new Gson().fromJson(data, new TypeToken<Map<Object, Object>>() {

            }.getType());
        }
        return new HashMap<>();
    }

    public static Boolean isFileExist(String path) {
        log.info("Inside isFileExist {}", path);
        try {
            File file = new File(path);
            return (file != null && file.exists()) ? Boolean.TRUE : Boolean.FALSE;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
