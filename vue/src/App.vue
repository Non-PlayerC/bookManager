<template>
  <div id="app">
    <!-- head part -->
    <div style="height: 60px;line-height: 60px;background-color: white;margin-bottom: 2px;">
      <img src="@/assets/logo.png" alt="logo" style="width: 60px;height: 60px;">
      <span style="margin-left: 10px; font-size: 24px;">XP管理</span>
    </div>

    <!-- left prat and main -->
    <div style="display: flex;">
      <!-- 侧边栏导航 -->
      <div style="width: 200px;min-height: calc(100vh-62px); overflow: hidden;margin-right: 2px;background-color: white;">
        <el-menu :default-active="$route.path" :default-opends="['/']" router class="el-menu-demo">
          <el-menu-item index="/">
            <i class="el-icon-eleme">
              <span>首页</span>
            </i>
          </el-menu-item>
          <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-question">
                <span>关于页面</span>
              </i>
            </template>
            <el-menu-item index="about">关于详情</el-menu-item>
          </el-submenu>
        </el-menu>
      </div>
      <!-- 主题数据 -->
      <div style="flex: 1;background-color: white;">
        <router-view />
      </div>
    </div>


  </div>
</template>