<template>
  <div>
    <el-table :data="tableData" stripe style="width: 100%">
      <el-table-column prop="name" label="Date" width="180" />
      <el-table-column prop="age" label="Name" width="180" />
      <el-table-column prop="address" label="Address" />
      <el-table-column prop="phone" label="phone" />
    </el-table>
  </div>
</template>

<script>
export default {
  name: 'HomeView',

  data() {
    return {
      tableData: [
        { name: "王一", age: 20, address: '北京市', phone: "110" },
        { name: "王二", age: 20, address: '北京市', phone: "110" },
        { name: "王三", age: 20, address: '北京市', phone: "110" },
        { name: "王四", age: 20, address: '北京市', phone: "110" },
      ]
    }
  }
}
</script>
