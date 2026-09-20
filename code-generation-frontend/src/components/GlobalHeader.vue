<script setup lang="ts">
import { computed } from 'vue'
import { RouterLink, useRoute, useRouter } from 'vue-router'
import type { MenuProps } from 'ant-design-vue'
import { headerMenuItems } from '@/config/menu'

const route = useRoute()
const router = useRouter()

const selectedKeys = computed(() => [route.path])

const handleMenuClick: MenuProps['onClick'] = ({ key }) => {
  router.push(String(key))
}
</script>

<template>
  <div id="globalHeader">
    <a-row :wrap="false" align="middle">
      <a-col flex="none">
        <RouterLink to="/" class="title-bar">
          <img class="logo" src="@/assets/logo.png" alt="logo" />
          <span class="title">CodeGeneration</span>
        </RouterLink>
      </a-col>
      <a-col flex="auto" class="menu-col">
        <a-menu
          :selected-keys="selectedKeys"
          mode="horizontal"
          :items="headerMenuItems"
          @click="handleMenuClick"
        />
      </a-col>
      <a-col flex="none">
        <div class="user-login-status">
          <a-button type="primary">登录</a-button>
        </div>
      </a-col>
    </a-row>
  </div>
</template>

<style scoped>
#globalHeader {
  width: 100%;
}

.title-bar {
  display: flex;
  align-items: center;
  margin-right: 16px;
  color: inherit;
  text-decoration: none;
}

.logo {
  height: 40px;
  width: 40px;
  object-fit: contain;
  border-radius: 50%;
}

.title {
  margin-left: 8px;
  color: rgba(0, 0, 0, 0.88);
  font-size: 18px;
  font-weight: 600;
  white-space: nowrap;
}

.menu-col {
  min-width: 0;
  overflow: hidden;
}

.user-login-status {
  margin-left: 16px;
  white-space: nowrap;
}

:deep(.ant-menu-horizontal) {
  border-bottom: none;
  line-height: 64px;
}

@media (max-width: 480px) {
  .title {
    display: none;
  }

  .title-bar,
  .user-login-status {
    margin-right: 8px;
    margin-left: 8px;
  }
}
</style>
