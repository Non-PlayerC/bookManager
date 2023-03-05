<template>
  <div>
    <!-- 搜索表单 -->
    <div>
      <el-input style="width: 240px" placeholder="请输入名称"></el-input>
      <el-input style="width: 240px;margin-left: 5px;" placeholder="请输入电话"></el-input>
      <el-button style="margin-left: 5px;" type="primary"><i class=" el-icon-search"></i></el-button>
    </div>

    <el-table :data="tableData" stripe style="width: 100%">
      <el-table-column prop="name" label="Date" width="180" />
      <el-table-column prop="age" label="Name" width="180" />
      <el-table-column prop="address" label="Address" />
      <el-table-column prop="phone" label="phone" />
      <el-table-column prop="sex" label="性别" />
    </el-table>

    <!-- 分页 -->
    <el-pagination background :page-size="5" layout="prev, pager, next" :total="20" />
  </div>
</template>

<script>
export default {
  name: 'HomeView',

  data() {
    return {
      tableData: []
    }
  },
  created() {
    this.load()
  },
  methods: {
    load() {
      fetch("http://localhost:9090/user/list").then(res => res.json()).then(res => {
        console.log(res)
        this.tableData = res
      })
    }
  }
}
</script>
