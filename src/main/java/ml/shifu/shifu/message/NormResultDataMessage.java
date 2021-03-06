/**
 * Copyright [2012-2014] PayPal Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.shifu.message;

import java.util.List;

/**
 * NormResultDataMessage class is the message that contains the pre-normalized and normalized data
 */
public class NormResultDataMessage {

    private int targetMsgCnt;
    private List<String> selectDataList;
    private List<List<Double>> normalizedDataList;

    /**
     * @param targetMsgCnt
     * @param normalizedDataList
     */
    public NormResultDataMessage(int targetMsgCnt, List<String> selectDataList, List<List<Double>> normalizedDataList) {
        this.targetMsgCnt = targetMsgCnt;
        this.selectDataList = selectDataList;
        this.normalizedDataList = normalizedDataList;
    }

    public int getTargetMsgCnt() {
        return targetMsgCnt;
    }

    public List<String> getSelectDataList() {
        return selectDataList;
    }

    public List<List<Double>> getNormalizedDataList() {
        return normalizedDataList;
    }

}
