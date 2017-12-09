/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.schedule.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * イベント
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Event implements Serializable {

	/** イベント名 */
	private String name;

	/** メタデータ */
	private String meta;

	/** 開始日時 */
	private Integer begin;

	/** 終了日時 */
	private Integer end;


	/**
	 * イベント名を取得
	 *
	 * @return イベント名
	 */
	public String getName() {
		return name;
	}

	/**
	 * イベント名を設定
	 *
	 * @param name イベント名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * メタデータを取得
	 *
	 * @return メタデータ
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * メタデータを設定
	 *
	 * @param meta メタデータ
	 */
	public void setMeta(String meta) {
		this.meta = meta;
	}

	/**
	 * 開始日時を取得
	 *
	 * @return 開始日時
	 */
	public Integer getBegin() {
		return begin;
	}

	/**
	 * 開始日時を設定
	 *
	 * @param begin 開始日時
	 */
	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	/**
	 * 終了日時を取得
	 *
	 * @return 終了日時
	 */
	public Integer getEnd() {
		return end;
	}

	/**
	 * 終了日時を設定
	 *
	 * @param end 終了日時
	 */
	public void setEnd(Integer end) {
		this.end = end;
	}

}