/**
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

// @Generated by gentest/gentest.rb from gentest/fixtures/YGPercentageTest.html

package com.facebook.yoga;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YGPercentageTest {
  @Test
  public void test_percentage_width_height() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setWidthPercent(30f);
    root_child0.setHeightPercent(30f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(140f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(60f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_position_left_top() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(400f);
    root.setHeight(400f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setPositionPercent(YogaEdge.LEFT, 10f);
    root_child0.setPositionPercent(YogaEdge.TOP, 20f);
    root_child0.setWidthPercent(45f);
    root_child0.setHeightPercent(55f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(400f, root.getLayoutWidth(), 0.0f);
    assertEquals(400f, root.getLayoutHeight(), 0.0f);

    assertEquals(40f, root_child0.getLayoutX(), 0.0f);
    assertEquals(80f, root_child0.getLayoutY(), 0.0f);
    assertEquals(180f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(220f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(400f, root.getLayoutWidth(), 0.0f);
    assertEquals(400f, root.getLayoutHeight(), 0.0f);

    assertEquals(260f, root_child0.getLayoutX(), 0.0f);
    assertEquals(80f, root_child0.getLayoutY(), 0.0f);
    assertEquals(180f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(220f, root_child0.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_position_bottom_right() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(500f);
    root.setHeight(500f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setPositionPercent(YogaEdge.RIGHT, 20f);
    root_child0.setPositionPercent(YogaEdge.BOTTOM, 10f);
    root_child0.setWidthPercent(55f);
    root_child0.setHeightPercent(15f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(500f, root.getLayoutWidth(), 0.0f);
    assertEquals(500f, root.getLayoutHeight(), 0.0f);

    assertEquals(-100f, root_child0.getLayoutX(), 0.0f);
    assertEquals(-50f, root_child0.getLayoutY(), 0.0f);
    assertEquals(275f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(75f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(500f, root.getLayoutWidth(), 0.0f);
    assertEquals(500f, root.getLayoutHeight(), 0.0f);

    assertEquals(125f, root_child0.getLayoutX(), 0.0f);
    assertEquals(-50f, root_child0.getLayoutY(), 0.0f);
    assertEquals(275f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(75f, root_child0.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(50f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(1f);
    root_child1.setFlexBasisPercent(25f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(125f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(125f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(75f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(75f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(125f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(75f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_cross() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(50f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(1f);
    root_child1.setFlexBasisPercent(25f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(125f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(125f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(75f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(125f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(125f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(75f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_cross_min_height() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setMinHeightPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(2f);
    root_child1.setMinHeightPercent(10f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(140f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(140f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(140f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(140f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_main_max_height() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(10f);
    root_child0.setMaxHeightPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(10f);
    root_child1.setMaxHeightPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(52f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(52f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(148f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(148f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(52f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(148f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_cross_max_height() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(10f);
    root_child0.setMaxHeightPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(10f);
    root_child1.setMaxHeightPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(120f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(120f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(40f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_main_max_width() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(15f);
    root_child0.setMaxWidthPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(10f);
    root_child1.setMaxWidthPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(120f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(40f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_cross_max_width() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(10f);
    root_child0.setMaxWidthPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(15f);
    root_child1.setMaxWidthPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(160f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(40f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_main_min_width() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setFlexDirection(YogaFlexDirection.ROW);
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(15f);
    root_child0.setMinWidthPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(10f);
    root_child1.setMinWidthPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(120f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(80f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(80f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child1.getLayoutY(), 0.0f);
    assertEquals(80f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_flex_basis_cross_min_width() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(10f);
    root_child0.setMinWidthPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(15f);
    root_child1.setMinWidthPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(50f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(50f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(150f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_multiple_nested_with_padding_margin_and_percentage_values() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(200f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setFlexBasisPercent(10f);
    root_child0.setMargin(YogaEdge.LEFT, 5f);
    root_child0.setMargin(YogaEdge.TOP, 5f);
    root_child0.setMargin(YogaEdge.RIGHT, 5f);
    root_child0.setMargin(YogaEdge.BOTTOM, 5f);
    root_child0.setPadding(YogaEdge.LEFT, 3);
    root_child0.setPadding(YogaEdge.TOP, 3);
    root_child0.setPadding(YogaEdge.RIGHT, 3);
    root_child0.setPadding(YogaEdge.BOTTOM, 3);
    root_child0.setMinWidthPercent(60f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = new YogaNode();
    root_child0_child0.setMargin(YogaEdge.LEFT, 5f);
    root_child0_child0.setMargin(YogaEdge.TOP, 5f);
    root_child0_child0.setMargin(YogaEdge.RIGHT, 5f);
    root_child0_child0.setMargin(YogaEdge.BOTTOM, 5f);
    root_child0_child0.setPaddingPercent(YogaEdge.LEFT, 3);
    root_child0_child0.setPaddingPercent(YogaEdge.TOP, 3);
    root_child0_child0.setPaddingPercent(YogaEdge.RIGHT, 3);
    root_child0_child0.setPaddingPercent(YogaEdge.BOTTOM, 3);
    root_child0_child0.setWidthPercent(50f);
    root_child0.addChildAt(root_child0_child0, 0);

    final YogaNode root_child0_child0_child0 = new YogaNode();
    root_child0_child0_child0.setMarginPercent(YogaEdge.LEFT, 5f);
    root_child0_child0_child0.setMarginPercent(YogaEdge.TOP, 5f);
    root_child0_child0_child0.setMarginPercent(YogaEdge.RIGHT, 5f);
    root_child0_child0_child0.setMarginPercent(YogaEdge.BOTTOM, 5f);
    root_child0_child0_child0.setPadding(YogaEdge.LEFT, 3);
    root_child0_child0_child0.setPadding(YogaEdge.TOP, 3);
    root_child0_child0_child0.setPadding(YogaEdge.RIGHT, 3);
    root_child0_child0_child0.setPadding(YogaEdge.BOTTOM, 3);
    root_child0_child0_child0.setWidthPercent(45f);
    root_child0_child0.addChildAt(root_child0_child0_child0, 0);

    final YogaNode root_child1 = new YogaNode();
    root_child1.setFlexGrow(4f);
    root_child1.setFlexBasisPercent(15f);
    root_child1.setMinWidthPercent(20f);
    root.addChildAt(root_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(5f, root_child0.getLayoutX(), 0.0f);
    assertEquals(5f, root_child0.getLayoutY(), 0.0f);
    assertEquals(190f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(48f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(8f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(8f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(92f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(25f, root_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(10f, root_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(36f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(6f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(58f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(142f, root_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(200f, root.getLayoutHeight(), 0.0f);

    assertEquals(5f, root_child0.getLayoutX(), 0.0f);
    assertEquals(5f, root_child0.getLayoutY(), 0.0f);
    assertEquals(190f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(48f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(90f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(8f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(92f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(25f, root_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(46f, root_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(36f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(6f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child1.getLayoutX(), 0.0f);
    assertEquals(58f, root_child1.getLayoutY(), 0.0f);
    assertEquals(200f, root_child1.getLayoutWidth(), 0.0f);
    assertEquals(142f, root_child1.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_margin_should_calculate_based_only_on_width() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setMarginPercent(YogaEdge.LEFT, 10f);
    root_child0.setMarginPercent(YogaEdge.TOP, 10f);
    root_child0.setMarginPercent(YogaEdge.RIGHT, 10f);
    root_child0.setMarginPercent(YogaEdge.BOTTOM, 10f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = new YogaNode();
    root_child0_child0.setWidth(10f);
    root_child0_child0.setHeight(10f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0.getLayoutX(), 0.0f);
    assertEquals(20f, root_child0.getLayoutY(), 0.0f);
    assertEquals(160f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0.getLayoutX(), 0.0f);
    assertEquals(20f, root_child0.getLayoutY(), 0.0f);
    assertEquals(160f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(60f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(150f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_padding_should_calculate_based_only_on_width() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setFlexGrow(1f);
    root_child0.setPaddingPercent(YogaEdge.LEFT, 10);
    root_child0.setPaddingPercent(YogaEdge.TOP, 10);
    root_child0.setPaddingPercent(YogaEdge.RIGHT, 10);
    root_child0.setPaddingPercent(YogaEdge.BOTTOM, 10);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = new YogaNode();
    root_child0_child0.setWidth(10f);
    root_child0_child0.setHeight(10f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(20f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(20f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(170f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(20f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0_child0.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_absolute_position() {
    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, true);

    final YogaNode root = new YogaNode();
    root.setWidth(200f);
    root.setHeight(100f);

    final YogaNode root_child0 = new YogaNode();
    root_child0.setPositionType(YogaPositionType.ABSOLUTE);
    root_child0.setPositionPercent(YogaEdge.LEFT, 30f);
    root_child0.setPositionPercent(YogaEdge.TOP, 10f);
    root_child0.setWidth(10f);
    root_child0.setHeight(10f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(60f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(200f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(60f, root_child0.getLayoutX(), 0.0f);
    assertEquals(10f, root_child0.getLayoutY(), 0.0f);
    assertEquals(10f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(10f, root_child0.getLayoutHeight(), 0.0f);

    YogaNode.setExperimentalFeatureEnabled(YogaExperimentalFeature.ROUNDING, false);
  }

  @Test
  public void test_percentage_width_height_undefined_parent_size() {
    final YogaNode root = new YogaNode();

    final YogaNode root_child0 = new YogaNode();
    root_child0.setWidthPercent(50f);
    root_child0.setHeightPercent(50f);
    root.addChildAt(root_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(0f, root.getLayoutWidth(), 0.0f);
    assertEquals(0f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(0f, root.getLayoutWidth(), 0.0f);
    assertEquals(0f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0.getLayoutHeight(), 0.0f);
  }

}
