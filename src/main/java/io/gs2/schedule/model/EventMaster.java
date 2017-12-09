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
 * イベントマスター
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class EventMaster implements Serializable {

	/** イベントマスターGRN */
	private String eventMasterId;

	/** イベントマスター名 */
	private String name;

	/** メタデータ */
	private String meta;

	/** 期間 */
	private String type;

	/** 絶対時間を選択した場合の開始日時 */
	private Integer absoluteBegin;

	/** 絶対時間を選択した場合の終了日時 */
	private Integer absoluteEnd;

	/** 相対時間を選択した場合の開始トリガー名 */
	private String relativeTriggerName;

	/** 相対時間を選択した場合のトリガーを引いてからのイベント期間(分) */
	private Integer relativeSpan;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;


	/**
	 * イベントマスターGRNを取得
	 *
	 * @return イベントマスターGRN
	 */
	public String getEventMasterId() {
		return eventMasterId;
	}

	/**
	 * イベントマスターGRNを設定
	 *
	 * @param eventMasterId イベントマスターGRN
	 */
	public void setEventMasterId(String eventMasterId) {
		this.eventMasterId = eventMasterId;
	}

	/**
	 * イベントマスター名を取得
	 *
	 * @return イベントマスター名
	 */
	public String getName() {
		return name;
	}

	/**
	 * イベントマスター名を設定
	 *
	 * @param name イベントマスター名
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
	 * 期間を取得
	 *
	 * @return 期間
	 */
	public String getType() {
		return type;
	}

	/**
	 * 期間を設定
	 *
	 * @param type 期間
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 絶対時間を選択した場合の開始日時を取得
	 *
	 * @return 絶対時間を選択した場合の開始日時
	 */
	public Integer getAbsoluteBegin() {
		return absoluteBegin;
	}

	/**
	 * 絶対時間を選択した場合の開始日時を設定
	 *
	 * @param absoluteBegin 絶対時間を選択した場合の開始日時
	 */
	public void setAbsoluteBegin(Integer absoluteBegin) {
		this.absoluteBegin = absoluteBegin;
	}

	/**
	 * 絶対時間を選択した場合の終了日時を取得
	 *
	 * @return 絶対時間を選択した場合の終了日時
	 */
	public Integer getAbsoluteEnd() {
		return absoluteEnd;
	}

	/**
	 * 絶対時間を選択した場合の終了日時を設定
	 *
	 * @param absoluteEnd 絶対時間を選択した場合の終了日時
	 */
	public void setAbsoluteEnd(Integer absoluteEnd) {
		this.absoluteEnd = absoluteEnd;
	}

	/**
	 * 相対時間を選択した場合の開始トリガー名を取得
	 *
	 * @return 相対時間を選択した場合の開始トリガー名
	 */
	public String getRelativeTriggerName() {
		return relativeTriggerName;
	}

	/**
	 * 相対時間を選択した場合の開始トリガー名を設定
	 *
	 * @param relativeTriggerName 相対時間を選択した場合の開始トリガー名
	 */
	public void setRelativeTriggerName(String relativeTriggerName) {
		this.relativeTriggerName = relativeTriggerName;
	}

	/**
	 * 相対時間を選択した場合のトリガーを引いてからのイベント期間(分)を取得
	 *
	 * @return 相対時間を選択した場合のトリガーを引いてからのイベント期間(分)
	 */
	public Integer getRelativeSpan() {
		return relativeSpan;
	}

	/**
	 * 相対時間を選択した場合のトリガーを引いてからのイベント期間(分)を設定
	 *
	 * @param relativeSpan 相対時間を選択した場合のトリガーを引いてからのイベント期間(分)
	 */
	public void setRelativeSpan(Integer relativeSpan) {
		this.relativeSpan = relativeSpan;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

}