package com.muffin_java.web.asset;


import com.muffin_java.web.utils.Box;
import com.querydsl.core.Tuple;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/assets")
public class AssetController {

    private static final Logger logger = LoggerFactory.getLogger(AssetController.class);
    private AssetService assetService;
    private Box box;

    @GetMapping("/totalbudget/{userid}")
    public Box<List<Asset>> findByUserId(@PathVariable String userid){
        return assetService.getUserBudget(userid);
    }

    @GetMapping("/test")
    public Asset getData() {
        logger.info("/asset/test AssetController");
        return assetService.showData();
    }
}
