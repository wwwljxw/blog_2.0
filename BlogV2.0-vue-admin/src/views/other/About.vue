<template>
  <el-card class="main-card">

    <mavon-editor v-model="aboutContent" style="height:calc(100vh - 215px)" />
    <el-button
            type="danger"
            size="medium"
            class="edit-btn"
            @click="updateAbout"
    >
      修改
    </el-button>
  </el-card>
</template>

<script>
  export default {
    created() {
      this.getAbout();
    },
    data: function() {
      return {
        aboutContent: ""
      };
    },
    methods: {
      getAbout() {
        this.axios.get("/api/getAbout").then(({ data }) => {
          this.aboutContent = data.data.data.content;
        });
      },
      updateAbout() {
        let param = new URLSearchParams();
        param.append("aboutContent", this.aboutContent);
        this.axios.put("/api/updateAbout", param).then(({ data }) => {
          if (data.success) {
            this.$notify.success({
              title: "成功",
              message: data.message
            });
          } else {
            this.$notify.error({
              title: "失败",
              message: data.message
            });
          }
        });
      }
    }
  };
</script>

<style scoped>
  .edit-btn {
    float: right;
    margin: 1rem 0;
  }
</style>
