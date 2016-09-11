package com.txc.arethmetic.service;

import com.txc.model.CityInfo;
import com.txc.model.constructor.CityInfoConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class CityInfoService {
    private List<CityInfo> cityInfoList;
    public CityInfoService(List<CityInfo> cityInfoList){
        this.cityInfoList = cityInfoList;
    }
    private CityInfo getById(int cityId){
        for (int i = 0; i < cityInfoList.size(); i++) {
            if(cityId == cityInfoList.get(i).getCityId()){
                return cityInfoList.get(i);
            }
        }
        return null;
    }
    @AllArgsConstructor
    @Getter
    enum SelectorType{
        NORMAL(1,"普通算法");
        private int type;
        private String desc;
    }
    public CityInfo cityInfoSelector(int cityId,SelectorType selectTypeEnum){
        long startTime = System.currentTimeMillis();
        CityInfo cityInfo = null;
        switch (selectTypeEnum){
            case NORMAL:
                cityInfo =  getById(cityId);
                break;
            default:return null;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(selectTypeEnum.desc + "消耗时间：" + (endTime - startTime));
        return cityInfo;
    }
    public static void main(String args[]){
        List<CityInfo> cityInfoList = CityInfoConstructor.getCityInfoList(2000000);
        CityInfoService cityInfoService = new CityInfoService(cityInfoList);
        cityInfoService.cityInfoSelector(121221222, SelectorType.NORMAL);
    }
}
