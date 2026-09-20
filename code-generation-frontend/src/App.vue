<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'
import { healthCheck } from '@/api/healthController.ts'

healthCheck().then((res) => {
  console.log(res)
})
</script>

<template>
  <BasicLayout />
</template>

<style>
html,
body,
#app {
  height: 100%;
  margin: 0;
  overflow: hidden;
}
</style>
