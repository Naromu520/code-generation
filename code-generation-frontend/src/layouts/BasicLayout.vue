<script setup lang="ts">
import { RouterView } from 'vue-router'
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalFooter from '@/components/GlobalFooter.vue'
</script>

<template>
  <a-layout id="basicLayout">
    <a-layout-header class="header">
      <GlobalHeader />
    </a-layout-header>
    <a-layout-content class="content">
      <RouterView />
    </a-layout-content>
    <a-layout-footer class="footer">
      <GlobalFooter />
    </a-layout-footer>
  </a-layout>
</template>

<style scoped>
#basicLayout {
  height: 100vh;
  background: #f5f5f5;
}

.header {
  z-index: 100;
  padding-inline: 24px;
  color: unset;
  background: #fff;
  box-shadow: 0 1px 4px rgba(0, 21, 41, 0.08);
}

.content {
  flex: 1;
  min-height: 0;
  margin: 16px 24px;
  padding: 24px;
  overflow: auto;
  background: #fff;
}

.footer {
  padding: 16px;
  background: #efefef;
}

@media (max-width: 768px) {
  .header {
    padding-inline: 12px;
  }

  .content {
    margin: 12px;
    padding: 16px;
  }
}
</style>
