package am.itspace.cafemanagementsystem.restImpl;

import am.itspace.cafemanagementsystem.rest.DashboardRest;
import am.itspace.cafemanagementsystem.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DashboardRestImpl implements DashboardRest {

    private final DashboardService dashboardService;

    @Override
    public ResponseEntity<Map<String, Object>> getCount() {
        return dashboardService.getCount();
    }
}
