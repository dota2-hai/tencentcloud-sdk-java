/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParsedTableInfo extends AbstractModel{

    /**
    * 表描述语言类型：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表数据类型：`GENERIC`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyFields")
    @Expose
    private String KeyFields;

    /**
    * 原主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldKeyFields")
    @Expose
    private String OldKeyFields;

    /**
    * 非主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueFields")
    @Expose
    private String ValueFields;

    /**
    * 原非主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldValueFields")
    @Expose
    private String OldValueFields;

    /**
    * 所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogicZoneId")
    @Expose
    private String LogicZoneId;

    /**
    * 主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SumKeyFieldSize")
    @Expose
    private Long SumKeyFieldSize;

    /**
    * 非主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SumValueFieldSize")
    @Expose
    private Long SumValueFieldSize;

    /**
    * 索引键集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexKeySet")
    @Expose
    private String IndexKeySet;

    /**
    * 分表因子集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardingKeySet")
    @Expose
    private String ShardingKeySet;

    /**
    * TDR版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TdrVersion")
    @Expose
    private Long TdrVersion;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get 表描述语言类型：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIdlType 表描述语言类型：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set 表描述语言类型：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIdlType 表描述语言类型：`PROTO`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get 表实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableInstanceId 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableInstanceId 表实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get 表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表数据类型：`GENERIC`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表数据类型：`GENERIC`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表数据类型：`GENERIC`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表数据类型：`GENERIC`或`TDR`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 主键字段信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyFields 主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyFields() {
        return this.KeyFields;
    }

    /**
     * Set 主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyFields 主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyFields(String KeyFields) {
        this.KeyFields = KeyFields;
    }

    /**
     * Get 原主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldKeyFields 原主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldKeyFields() {
        return this.OldKeyFields;
    }

    /**
     * Set 原主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldKeyFields 原主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldKeyFields(String OldKeyFields) {
        this.OldKeyFields = OldKeyFields;
    }

    /**
     * Get 非主键字段信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueFields 非主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueFields() {
        return this.ValueFields;
    }

    /**
     * Set 非主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueFields 非主键字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueFields(String ValueFields) {
        this.ValueFields = ValueFields;
    }

    /**
     * Get 原非主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldValueFields 原非主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldValueFields() {
        return this.OldValueFields;
    }

    /**
     * Set 原非主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldValueFields 原非主键字段信息，改表校验时有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldValueFields(String OldValueFields) {
        this.OldValueFields = OldValueFields;
    }

    /**
     * Get 所属大区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogicZoneId 所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogicZoneId() {
        return this.LogicZoneId;
    }

    /**
     * Set 所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogicZoneId 所属大区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogicZoneId(String LogicZoneId) {
        this.LogicZoneId = LogicZoneId;
    }

    /**
     * Get 主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SumKeyFieldSize 主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSumKeyFieldSize() {
        return this.SumKeyFieldSize;
    }

    /**
     * Set 主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param SumKeyFieldSize 主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSumKeyFieldSize(Long SumKeyFieldSize) {
        this.SumKeyFieldSize = SumKeyFieldSize;
    }

    /**
     * Get 非主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SumValueFieldSize 非主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSumValueFieldSize() {
        return this.SumValueFieldSize;
    }

    /**
     * Set 非主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param SumValueFieldSize 非主键字段总大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSumValueFieldSize(Long SumValueFieldSize) {
        this.SumValueFieldSize = SumValueFieldSize;
    }

    /**
     * Get 索引键集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexKeySet 索引键集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexKeySet() {
        return this.IndexKeySet;
    }

    /**
     * Set 索引键集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexKeySet 索引键集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexKeySet(String IndexKeySet) {
        this.IndexKeySet = IndexKeySet;
    }

    /**
     * Get 分表因子集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardingKeySet 分表因子集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShardingKeySet() {
        return this.ShardingKeySet;
    }

    /**
     * Set 分表因子集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardingKeySet 分表因子集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardingKeySet(String ShardingKeySet) {
        this.ShardingKeySet = ShardingKeySet;
    }

    /**
     * Get TDR版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TdrVersion TDR版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTdrVersion() {
        return this.TdrVersion;
    }

    /**
     * Set TDR版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TdrVersion TDR版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTdrVersion(Long TdrVersion) {
        this.TdrVersion = TdrVersion;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Error 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "KeyFields", this.KeyFields);
        this.setParamSimple(map, prefix + "OldKeyFields", this.OldKeyFields);
        this.setParamSimple(map, prefix + "ValueFields", this.ValueFields);
        this.setParamSimple(map, prefix + "OldValueFields", this.OldValueFields);
        this.setParamSimple(map, prefix + "LogicZoneId", this.LogicZoneId);
        this.setParamSimple(map, prefix + "SumKeyFieldSize", this.SumKeyFieldSize);
        this.setParamSimple(map, prefix + "SumValueFieldSize", this.SumValueFieldSize);
        this.setParamSimple(map, prefix + "IndexKeySet", this.IndexKeySet);
        this.setParamSimple(map, prefix + "ShardingKeySet", this.ShardingKeySet);
        this.setParamSimple(map, prefix + "TdrVersion", this.TdrVersion);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

